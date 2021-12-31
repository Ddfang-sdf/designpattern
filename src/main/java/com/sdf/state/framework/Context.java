package com.sdf.state.framework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Context {
    private State state;
    public void push(){
        state.handlePush(this);
        System.out.println(state.getColor());
    }
    public void pull(){
        state.handlePull(this);
        System.out.println(state.getColor());
    }


//    public void push(){
//        if (state == Color.RED){
//            state = Color.BLUE;
//        }
//        if (state == Color.BLUE){
//            state = Color.GREEN;
//        }
//        if (state == Color.BLACK){
//            state = Color.RED;
//        }else {
//            state = Color.BLACK;
//        }
//        System.out.println(state.name());
//    }
//
//    public void pull(){
//        if (state == Color.GREEN){
//            state = Color.BLUE;
//        }
//        if (state == Color.BLACK){
//            state = Color.GREEN;
//        }
//        if (state == Color.BLUE){
//            state = Color.RED;
//        }else {
//            state = Color.BLACK;
//        }
//        System.out.println(state.name());
//    }
}
