package io.xiangchunqu.socket;

import io.xiangchunqu.Actor;
import io.xiangchunqu.Container;

import java.util.Map;

/**
 *
 */
public class SocketContainer implements Container {

    @Override
    public String name() {
        return "socket";
    }


    @Override
    public Map<String, Actor> getActorMap() {
        return Map.of();
    }
}
