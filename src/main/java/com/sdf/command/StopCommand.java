package com.sdf.command;

import com.sdf.command.framework.AudioPlayer;
import com.sdf.command.framework.Command;

public class StopCommand implements Command {
    private AudioPlayer audio;
    public StopCommand(AudioPlayer audio) {
        this.audio = audio;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audio.stop();
    }
}