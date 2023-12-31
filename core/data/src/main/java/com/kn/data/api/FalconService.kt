package com.kn.data.api

import com.kn.model.body.FindFalconBody
import com.kn.model.response.FindFalconResponse
import com.kn.model.response.PlanetsEntity
import com.kn.model.response.TokenResponse
import com.kn.model.response.VehicleEntity
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

/** @Author Kamal Nayan
Created on: 03/10/23
 **/
interface FalconService {
    @POST("token")
    suspend fun getToken():ApiResponse<TokenResponse>

    @GET("planets")
    suspend fun getPlanets():ApiResponse<List<PlanetsEntity>>

    @GET("vehicles")
    suspend fun getVehicles():ApiResponse<List<VehicleEntity>>

    @POST("find")
    suspend fun findFalcon(@Body body:FindFalconBody):ApiResponse<FindFalconResponse>
}