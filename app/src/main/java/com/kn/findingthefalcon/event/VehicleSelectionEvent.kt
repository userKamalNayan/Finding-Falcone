package com.kn.findingthefalcon.event

/** @Author Kamal Nayan
Created on: 06/10/23
 **/
sealed class VehicleSelectionEvent{

 data class VehicleSelected(val data:HashMap<String,String>,val totalTimeTaken:Int):VehicleSelectionEvent()

 data class VehicleNotAvailable(val vehicleName:String):VehicleSelectionEvent()

 data object MaximumPlanetsSelected:VehicleSelectionEvent()

}
