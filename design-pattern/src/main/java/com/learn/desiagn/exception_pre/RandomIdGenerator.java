package com.learn.desiagn.exception_pre;

import com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @author: lisy
 * @version: : RandomIdGenerator , v0.1 2020年08月27日 4:11 下午
 * @remark: the RandomIdGenerator is
 */
public class RandomIdGenerator implements IdGenerator {

    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);

    @Override
    public String generate() throws Exception {
        String substrOfHostName = null;
        try{
            substrOfHostName = getLastFiledOfHostName();
        }catch (Exception e){
            throw new Exception("hos name is empty.");
        }
        long currentTimeMills = System.currentTimeMillis();
        String randomString = generateRandomAlphameric(8);
        String id = String.format("%s-%d_%s" , substrOfHostName , currentTimeMills , randomString);
        return id;
    }

    @Override
    public String getLastFiledOfHostName() throws UnknownHostException {
        String substrOfHostName = null;
        String hostName = InetAddress.getLocalHost().getHostName();
        if (null == hostName || hostName.isEmpty()){
            throw new UnknownHostException("....");
        }
        substrOfHostName = getLastSubstrSplittedByDot(hostName);
        return substrOfHostName;
    }

    @VisibleForTesting
    private String getLastSubstrSplittedByDot(String hostName) {
        if (null == hostName || hostName.isEmpty()){
            throw new IllegalArgumentException("...."); //运行时异常
        }
        String[] tokens = hostName.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }

    @VisibleForTesting
    private String generateRandomAlphameric(int length) {
        if (length < 0 ){
            throw new IllegalArgumentException("...");
        }

        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length){
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit = randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase = randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase = randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit || isUppercase || isLowercase){
                randomChars[count] = (char) randomAscii;
                ++count;
            }
        }
        return new String(randomChars);
    }

    public static void main(String[] args) throws Exception {
        RandomIdGenerator randomIdGenerator = new RandomIdGenerator();
        System.out.println(randomIdGenerator.generate().hashCode());
    }
}
