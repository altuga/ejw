package com.kodcu.question22;

//1
public enum MusicTeam {
    GUITARMAN, SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;
    public int numberOfMusicians() { return ordinal() + 1; }
}