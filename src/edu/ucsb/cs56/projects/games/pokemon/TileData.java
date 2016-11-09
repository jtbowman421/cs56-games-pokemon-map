package edu.ucsb.cs56.projects.games.pokemon;

import edu.ucsb.cs56.projects.games.pokemon.graphics.Texture;

/**
 * Class to contain TileData
 *
 * @author William Bennett
 */

// This class contains information about a tile, based on its ID
// Stuff like collision behavior, etc. It's all loaded from a file and stored in a set
public class TileData {
    int tileID;
    Texture sprite;
    boolean collision; // Should be changed to an enum eventually

    /**
     * Main constructor for tile data
     *
     * @param tileID the id number for the tile
     * @param sprite the texture for the tile
     * @param collision whether the tile is walkable on or not
     */
    public TileData(int tileID, Texture sprite, boolean collision) {
        this.tileID = tileID;
        this.sprite = sprite;
        this.collision = collision;
    }
    
    /**
     * Overrides the hashCode method of Object to return the hashCode of the tileID
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(tileID);
    }

    /**
     * Overrides the equal method of Object to check if the tileID is the same
     * 
     * @param o the Object to compare
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof TileData) {
            TileData other = (TileData) o;
            return this.tileID == other.tileID;
        }
        return false;
    }

    /**
     * Returns the texture type associated with the tileID.
     *
     * List of tile ID types:
     *  grass_default: 0
     *  grass_wild: 1
     *  snow: 2
     *  water1: 3
     *  water2: 4
     *  waterN: N+2
     *  (Water9 is the final water type)
     *
     * @param tileID
     * @return
     */
    public static Texture IDToTexture(int tileID) {
        switch (tileID) {
            case 0: return Assets.grass_Default;
            case 1: return Assets.grass_Wild;
            case 2: return Assets.snow;
            case 3: return Assets.water1;
            case 4: return Assets.water2;
            case 5: return Assets.water3;
            case 6: return Assets.water4;
            case 7: return Assets.water5;
            case 8: return Assets.water6;
            case 9: return Assets.water7;
            case 10: return Assets.water8;
            case 11: return Assets.water9;
            default: return Assets.grass_Default;
        }
    }
}