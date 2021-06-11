package com.epam.prejap.tetris.block;

/**
 *
 * It creates I block of tetris with for rows
 * @see BlockFeed
 * @see Block
 * @see com.epam.prejap.tetris.game.Printer
 * @author Kanybek Mukalaev
 *
 */
class IBlock extends Block {
    static final byte [][] image = {
            {1},
            {1},
            {1},
            {1},
    };
    public IBlock(){
        super(image);
    }
}
