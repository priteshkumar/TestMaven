package com.mavixk.maventest;

class Mediaplayer{

  interface mediaFuncs {

    void play();

    void pause();

  }

  public void play(){
    System.out.println("play media file");
  }

  public void pause(){
    System.out.println("pause media file");
  }
}


class AudioPlayer  implements Mediaplayer.mediaFuncs{
  public void play(){
    System.out.println("play audio file");
  }

  public void  pause(){
    System.out.println("pause audio file");
  }
}

public class NestedInterfaceDemo{
  public static void main(String[] args){
    Mediaplayer.mediaFuncs mplay = new AudioPlayer();
    mplay.play();
    mplay.pause();
  }

}