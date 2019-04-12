package com.epam;

import com.epam.factories.*;
import com.epam.figures.Figure;

import java.util.ArrayList;
import java.util.Random;

public class FigureGenerator {

    private Random random = new Random();

    private ArrayList<FigureFactory> templates = new ArrayList<>();

    {
        templates.add(new FigureFactoryI());
        templates.add(new FigureFactoryL());
        templates.add(new FigureFactoryZ());
        templates.add(new FigureFactorySquare());
        // add other figure factories
    }

    public Figure generateFigure() {
        int randomIndex = random.nextInt(templates.size());
        return templates.get(randomIndex).createFigure();
    }

    public static void main(String[] args) {

        FigureGenerator figureGenerator = new FigureGenerator();

        for (int i=0; i<50; i++) {
            System.out.println(figureGenerator.generateFigure().getDescription());
        }
    }
}
