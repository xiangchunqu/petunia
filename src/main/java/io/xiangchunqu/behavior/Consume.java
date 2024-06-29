package io.xiangchunqu.behavior;

/**
 * 消耗和接收
 *
 * @param <P> param
 */
public interface Consume<P> {

    void consume(P p);

}
