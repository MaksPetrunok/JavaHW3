package com.epam.factories;

import com.epam.figures.Figure;
import com.epam.figures.FigureZ;

public class FigureFactoryZ extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new FigureZ();
    }
}
