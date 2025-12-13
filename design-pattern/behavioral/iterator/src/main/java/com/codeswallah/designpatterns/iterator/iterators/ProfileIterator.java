package com.codeswallah.designpatterns.iterator.iterators;

import com.codeswallah.designpatterns.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile next();
    void reset();
}
