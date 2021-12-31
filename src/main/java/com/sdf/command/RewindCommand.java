package com.sdf.command;

import com.sdf.command.framework.AudioPlayer;
import com.sdf.command.framework.Command;

public class RewindCommand implements Command {
    private AudioPlayer audio;
    public RewindCommand(AudioPlayer audio) {
        this.audio = audio;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audio.rewind();
    }
}