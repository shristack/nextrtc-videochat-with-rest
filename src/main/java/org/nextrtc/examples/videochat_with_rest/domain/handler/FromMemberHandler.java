/* Copyright 2015 Sabre Holdings */
package org.nextrtc.examples.videochat_with_rest.domain.handler;

import org.nextrtc.signalingserver.api.NextRTCHandler;
import org.nextrtc.signalingserver.api.dto.NextRTCEvent;
import org.nextrtc.signalingserver.api.dto.NextRTCMember;

public abstract class FromMemberHandler implements NextRTCHandler {
    @Override
    public void handleEvent(NextRTCEvent event) {
        event.from().ifPresent(from -> handleEvent(from, event));
    }

    protected abstract void handleEvent(NextRTCMember from, NextRTCEvent event);
}