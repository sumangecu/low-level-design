package com.codeswallah.designpatterns.componentss;

import com.codeswallah.designpatterns.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
