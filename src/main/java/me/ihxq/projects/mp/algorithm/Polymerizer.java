package me.ihxq.projects.mp.algorithm;

import me.ihxq.projects.mp.model.Marker;

import java.util.Collection;

/**
 * @author xq.h
 * on 2020/2/16 17:35
 **/
public interface Polymerizer<T extends Marker> {

    Collection<T> polymerize(Collection<T> markers);
}
