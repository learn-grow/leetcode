以超级马里奥游戏为例子


马里奥的形态就是状态
    小马里奥 超级马里奥 火焰马里奥

事件
    马里奥吃了蘑菇 马里奥打了某个怪
动作
    吃了蘑菇或得100积分，并变成超级马里奥(状态流转) 打了怪获取积分200
    
        MushRoom            cape            flower      monster
SMALL   super/+100          cape+200        fire+300    /
SUPER   /                   cape+200        fire+300    small/-100
CAPE    /                   /                /          small/-200
FIRE    /                   /                /          small/-300
