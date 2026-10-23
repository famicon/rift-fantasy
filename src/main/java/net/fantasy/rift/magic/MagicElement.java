package net.fantasy.rift.magic;

public enum MagicElement {
    PYRO("Solar Flame", 0xFFAA00),
    CRYO("Frostbite", 0x55FFFF),
    AETHER("Rift Spark", 0xAA00AA),
    TERRA("Stoneguard", 0x55AA55);

    private final String name;
    private final int color;

    MagicElement(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public String getName() { return name; }
    public int getColor() { return color; }
}
