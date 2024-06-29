package io.xiangchunqu;

import java.util.concurrent.BlockingQueue;

/**
 * Actor，统合了State，behavior，mailbox的集合体，同时也是接收和发送数据的主体<br>
 * Actor想要接发数据必须绑定到{@link Container}中
 */
public interface Actor {

    /**
     * 获取当前actor绑定的容器
     *
     * @return Container
     */
    Container getContainer();

    /**
     * 获取当前actor的名称
     *
     * @return actor名称
     */
    String name();

    /**
     * 获取当前actor邮箱中的数据，这个队列遵循FIFO的规则进行数据更新
     *
     * @return BlockingQueue
     */
    BlockingQueue<?> getQueue();

    /**
     * 获取邮箱中第一个消息
     *
     * @param <T> 消息类型
     * @return 消息体
     */
    <T> T getMsg();

    /**
     * 休眠当前的sleep，除非接收到外接的唤醒信号，否则actor将一直处于休眠状态<br>
     * 休眠不影响数据的接收
     */
    void sleep();

    /**
     * 唤醒当前的actor，唤醒后，将会为当前的actor分配一个线程，从而继续读取邮箱中的数据
     */
    void awaken();
}
