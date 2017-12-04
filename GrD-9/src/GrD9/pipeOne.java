/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrD9;

/**
 *
 * @author kristik
 */
public class pipeOne extends abstractPipe{
    private double pipeLength;
    private double pipeDiameter;
    private int plasticGrade;
    private int numberOfColours;
    private boolean insulation;
    private boolean reinforcement;
    private boolean chemicalResistance;
    

        
    public pipeOne(double pipeLength, double pipeDiameter, int plasticGrade, 
            int numberOfColours, boolean insulation, boolean reinforcement, 
            Boolean chemicalResistance){
        
        this.pipeLength = pipeLength;
        this.pipeDiameter = pipeDiameter;
        this.plasticGrade = plasticGrade;
        this.numberOfColours = numberOfColours;
        this.insulation = insulation;
        this.reinforcement = reinforcement;
        this.chemicalResistance = chemicalResistance;
    }
  


    public double findCost() {
    
        double volume = pipeVolume();
        double cost = 0;

        if(plasticGrade == 1) {
            cost = volume * 0.4;
        }

        else if(plasticGrade == 3) {
            cost = volume * 0.75
        }

        else if(chemicalResistance == true) {
            cost *= 1.14
        }

        return cost;

    }
}
        
    
    

