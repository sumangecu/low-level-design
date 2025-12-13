package com.codeswallah.designpatterns.iterator.social_networks;

import com.codeswallah.designpatterns.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}
