package com.leonardoborges.fallingdreams.models.pieces;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import com.leonardoborges.fallingdreams.models.Matrix;

public class ZPiece extends AbstractPiece {

	public ZPiece(Matrix matrix) {
		super(matrix);
		Rectangle rect1 = new Block(getStartPosition().x - BLOCK_SIDE_HEIGHT, getStartPosition().y, BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, Color.pink);
		Rectangle rect2 = new Block(getStartPosition().x, getStartPosition().y + BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, Color.pink);
		Rectangle rect3 = new Block(getStartPosition().x + BLOCK_SIDE_HEIGHT, getStartPosition().y + BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, Color.pink);
		Rectangle rect4 = new Block(getStartPosition().x, getStartPosition().y, BLOCK_SIDE_HEIGHT, BLOCK_SIDE_HEIGHT, Color.pink);
		blocks = new Rectangle[] {rect1, rect2, rect3, rect4};
	}
	
	@Override
	protected Point getPieceCenter() {
		return new Point(getStartPosition().x, getStartPosition().y);
	}	
}
