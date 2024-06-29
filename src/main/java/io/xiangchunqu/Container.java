package io.xiangchunqu;

import java.util.Map;

/**
 * 容器，容器可以被多个actor绑定，
 */
public interface Container {

    /**
     * 获取容器的名称
     *
     * @return String
     */
    String name();

    /**
     * 获取所有的actor
     *
     * @return Actor
     */
    Map<String, Actor> getActorMap();

}
