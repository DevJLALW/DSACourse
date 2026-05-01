package com.learnjavafromalgomaster.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();


        var hist = new History();
        editor.setContent("a");
        hist.push(editor.createState());

        editor.setContent("b");
        hist.push(editor.createState());

        editor.setContent("c");
        editor.restore(hist.pop());
        System.out.println(editor.getContent());
    }
}
