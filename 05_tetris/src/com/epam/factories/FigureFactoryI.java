package com.epam.factories;

import com.epam.figures.Figure;
import com.epam.figures.FigureI;
import com.epam.figures.FigureL;

public class FigureFactoryI extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new FigureI();
    }
}
