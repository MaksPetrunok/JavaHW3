package com.epam.factories;

import com.epam.figures.Figure;
import com.epam.figures.FigureSquare;

public class FigureFactorySquare extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new FigureSquare();
    }
}
