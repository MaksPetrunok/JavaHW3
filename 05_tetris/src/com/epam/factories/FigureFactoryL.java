package com.epam.factories;

import com.epam.figures.Figure;
import com.epam.figures.FigureL;

public class FigureFactoryL extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new FigureL();
    }
}
