package com.lee.order.command;

import com.lee.order.Command;
import com.lee.order.devices.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {        
        stereo.on();
    }

}
