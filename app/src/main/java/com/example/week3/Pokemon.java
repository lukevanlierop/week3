package com.example.week3;

public class Pokemon {

    private int _image;
    private String _name;

    public Pokemon(int img, String name)
    {
        _image = img;
        _name = name;
    }

    public int getImage()
    {
        return _image;
    }

    public String getName()
    {
        return _name;
    }
}
