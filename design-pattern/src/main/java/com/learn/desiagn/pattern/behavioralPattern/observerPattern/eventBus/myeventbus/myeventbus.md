eventbus中的两个核心概念
`
1 register
2 post
`

AObserver
@Subcribe
- f1(MSGA)
                                                            Observer注册表
BObserver                                                消息类型         可使用函数
@Subcribe  ---------register(object observer)---------->   MSGA              f1
- f2(MSGB)                                                 MSGB              f2
                                                           MSGC              f3
CObserver
@Subcribe
- f2(MSGC)

                                       Observer注册表
                                    消息类型         可使用函数
                                      MSGA              f1
post(new MSGB) ------------------->   MSGB              f2 利用java反射语法执行f2
                                      MSGC              f3    

observer注册表记录了消息类型和可接受消息函数的对应关系，当调用
register函数注册观察者的时候，eventbus通过解析@Subscribe注解
生成observer注册表，当调用post()函数发送消息时，eventbus通过注册表找到对应的可接受消息的函数
然后通过java的反射语句来动态的创建对象,执行函数，对于同步阻塞模式，eventbus在一个线程内依次执行
相应的函数，对于异步非阻塞模式，eventbus通过线程池来执行相应的函数

