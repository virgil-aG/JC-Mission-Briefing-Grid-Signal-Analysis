package com.example.demo;

import static java.lang.System.*;

public class GridSignalAnalyzer {
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

    public void analyzeWithForLoop(){
        for(int i = 0; i < scrambledGrid.length; i++){
            for (int j = 0; j < scrambledGrid[i].length; j++){
                out.print(scrambledGrid[i][j] + " ");
            }
            out.println();
        }
    }

    public void analyzeWithForEachLoop(){
        for(char[] rowArray: scrambledGrid){
            out.println("Processing Row with Hash: "+rowArray);
            for (char colArray: rowArray){
                out.println("->"+colArray);
            }
        }
    }

    public void analyzeWithHybridLoop(){
        for (char[] rowArray: scrambledGrid){
            for(int j = 0; j < rowArray.length; j++){
                out.print(rowArray[j] + " ");
            }
            out.println();
        }
    }
}
