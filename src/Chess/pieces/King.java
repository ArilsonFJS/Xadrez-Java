/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

/**
 *
 * @author arils
 */
//Classe Rei
public class King extends ChessPiece{
    
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return " K";
    }

    @Override
    public boolean[][] possibleMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
