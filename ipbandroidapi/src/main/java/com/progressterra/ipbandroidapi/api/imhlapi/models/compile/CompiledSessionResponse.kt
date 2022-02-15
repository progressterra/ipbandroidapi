package com.progressterra.ipbandroidapi.api.imhlapi.models.compile


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class CompiledSessionResponse(
    @SerializedName("data")
    val data: CompileSession?
) : BaseResponse()

data class CompileSession(
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idQuantumEnd")
    val idQuantumEnd: String?,
    @SerializedName("idQuantumStart")
    val idQuantumStart: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfActor")
    val idrfActor: String?,
    @SerializedName("listCompileQuantum")
    val listCompileQuantum: List<CompileQuantumBySession?>?,
    @SerializedName("listEffector")
    val listEffector: List<RGEffectorExt?>?,
    @SerializedName("sessionType")
    val sessionType: Int?,
    @SerializedName("title")
    val title: String?
)

data class CompileQuantumBySession(
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfActor")
    val idrfActor: String?,
    @SerializedName("listAffector")
    val listAffector: List<RFAffectorExt?>?,
    @SerializedName("listEffectorAreaQuant")
    val listEffectorAreaQuant: List<CompileEffector?>?,
    @SerializedName("listEffectorAreaReaction")
    val listEffectorAreaReaction: List<CompileEffector?>?,
    @SerializedName("listLingvoAffector")
    val listLingvoAffector: List<AffectrorAsLingvoAffector?>?,
    @SerializedName("listReaction")
    val listReaction: List<RGReactionExt?>?,
    @SerializedName("listVideoQuantum")
    val listVideoQuantum: List<MediaQuantum?>?,
    @SerializedName("playDataType")
    val playDataType: Int?,
    @SerializedName("replicaText")
    val replicaText: String?,
    @SerializedName("session")
    val session: RFSession?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("urlPlaySource")
    val urlPlaySource: String?
)

data class RFAffectorExt(
    @SerializedName("affectorType")
    val affectorType: Int?,
    @SerializedName("corticalColumnDataJSON")
    val corticalColumnDataJSON: String?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("titleTypeAffector")
    val titleTypeAffector: String?
)

data class CompileEffector(
    @SerializedName("area")
    val area: Int?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("effectorType")
    val effectorType: Int?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idForJump")
    val idForJump: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idccEntityForGetData")
    val idccEntityForGetData: String?,
    @SerializedName("idrfQuantum")
    val idrfQuantum: String?,
    @SerializedName("idrfSession")
    val idrfSession: String?,
    @SerializedName("idrgReaction")
    val idrgReaction: String?,
    @SerializedName("jsonData")
    val jsonData: String?,
    @SerializedName("quamntumJump")
    val quamntumJump: RFQuantum?,
    @SerializedName("seekJump")
    val seekJump: Int?,
    @SerializedName("titleTypeEffector")
    val titleTypeEffector: String?,
    @SerializedName("urlExternalAction")
    val urlExternalAction: String?
)

data class RFQuantum(
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfActor")
    val idrfActor: String?,
    @SerializedName("playDataType")
    val playDataType: Int?,
    @SerializedName("replicaText")
    val replicaText: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("urlPlaySource")
    val urlPlaySource: String?
)


data class AffectrorAsLingvoAffector(
    @SerializedName("affectorType")
    val affectorType: Int?,
    @SerializedName("corticalColumnDataJSON")
    val corticalColumnDataJSON: String?,
    @SerializedName("dataCCLingvoAffector")
    val dataCCLingvoAffector: LingvoAffectorData?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("titleTypeAffector")
    val titleTypeAffector: String?
)

data class LingvoAffectorData(
    @SerializedName("idrfAffector")
    val idrfAffector: String?,
    @SerializedName("lingvoPrimitiveList")
    val lingvoPrimitiveList: List<String?>?,
    @SerializedName("typeName")
    val typeName: String?
)


data class RGReactionExt(
    @SerializedName("affectorData")
    val affectorData: RFAffector?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("endResponseInterval")
    val endResponseInterval: Int?,
    @SerializedName("endTrackingInterval")
    val endTrackingInterval: Int?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfAffector")
    val idrfAffector: String?,
    @SerializedName("idrfQuantum")
    val idrfQuantum: String?,
    @SerializedName("listEffector")
    val listEffector: List<RGEffector?>?,
    @SerializedName("startResponseInterval")
    val startResponseInterval: Int?,
    @SerializedName("startTrackingInterval")
    val startTrackingInterval: Int?
)

data class RFAffector(
    @SerializedName("affectorType")
    val affectorType: Int?,
    @SerializedName("corticalColumnDataJSON")
    val corticalColumnDataJSON: String?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("language")
    val language: String?,
    @SerializedName("title")
    val title: String?
)

data class RGEffector(
    @SerializedName("area")
    val area: Int?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("effectorType")
    val effectorType: Int?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idForJump")
    val idForJump: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idccEntityForGetData")
    val idccEntityForGetData: String?,
    @SerializedName("idrfQuantum")
    val idrfQuantum: String?,
    @SerializedName("idrfSession")
    val idrfSession: String?,
    @SerializedName("idrgReaction")
    val idrgReaction: String?,
    @SerializedName("jsonData")
    val jsonData: String?,
    @SerializedName("seekJump")
    val seekJump: Int?,
    @SerializedName("urlExternalAction")
    val urlExternalAction: String?
)


data class MediaQuantum(
    @SerializedName("idrfQuantum")
    val idrfQuantum: String?,
    @SerializedName("urlMedia")
    val urlMedia: String?
)

data class RFSession(
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idQuantumEnd")
    val idQuantumEnd: String?,
    @SerializedName("idQuantumStart")
    val idQuantumStart: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfActor")
    val idrfActor: String?,
    @SerializedName("sessionType")
    val sessionType: Int?,
    @SerializedName("title")
    val title: String?
)


data class RGEffectorExt(
    @SerializedName("area")
    val area: Int?,
    @SerializedName("dateAdded")
    val dateAdded: String?,
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String?,
    @SerializedName("dateUpdate")
    val dateUpdate: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("effectorType")
    val effectorType: Int?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idForJump")
    val idForJump: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idccEntityForGetData")
    val idccEntityForGetData: String?,
    @SerializedName("idrfQuantum")
    val idrfQuantum: String?,
    @SerializedName("idrfSession")
    val idrfSession: String?,
    @SerializedName("idrgReaction")
    val idrgReaction: String?,
    @SerializedName("jsonData")
    val jsonData: String?,
    @SerializedName("seekJump")
    val seekJump: Int?,
    @SerializedName("titleTypeEffector")
    val titleTypeEffector: String?,
    @SerializedName("urlExternalAction")
    val urlExternalAction: String?
)

