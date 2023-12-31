package com.kn.commons.utils.annotation

import androidx.annotation.StringDef
import com.kn.commons.utils.annotation.Status.Companion.FAILURE
import com.kn.commons.utils.annotation.Status.Companion.SUCCESS

/** @Author Kamal Nayan
Created on: 09/10/23
 *
 * Denotes the status of finding falcon request.
 * if falcon is found then remote returns [SUCCESS]
 * otherwise [FAILURE].
 **/
@StringDef(Status.SUCCESS, Status.FAILURE)
annotation class Status() {
    companion object {
        const val SUCCESS = "success"
        const val FAILURE = "false"
    }
}
