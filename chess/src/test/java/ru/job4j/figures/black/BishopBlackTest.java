package ru.job4j.figures.black;

import com.sun.javafx.font.LogicalFont;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class BishopBlackTest {
    @Test
    public void whenPositionIsB8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B8);
        assertThat(bishopBlack.position(), is(Cell.B8));
    }

    @Test
    public void whenPositionWasCopiedToC7() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B8);
        assertThat(bishopBlack.copy(Cell.C7).position(), is(Cell.C7));
    }
    @Test
    public void whenWayC1G5ReturnsD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is( new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void whenWayG5C1ReturnsD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        assertThat(bishopBlack.way(Cell.G5, Cell.C1), is( new Cell[] {Cell.F4, Cell.E3, Cell.D2, Cell.C1}));
    }

    @Test
    public void whenDiagonalFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.isDiagonal(Cell.C1, Cell.G4), is(false));
    }

}





