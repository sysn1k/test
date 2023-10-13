package ru.ahub.interview

case class Source1(
    brandName: String,
    modelCode: String,
    modelName: String,
    transmissionType: String,
    bodyType: String,
    seatsCount: Int,
    doorsCount: Short,
    mileage: Option[Long],
    minPrice: Option[Long],
    maxPrice: Option[Long],
    hasAirConditioner: Boolean,
    hasStartStopSystem: Boolean,
    hasDriverAssistant: Boolean,
    hasABS: Boolean)

case class Source2(
    modelCode: String,
    transmissionType: String,
    transmissionDetailedType: String,
    gearsCount: Int,
    fuel: String,
    price: Long,
    mileage: Option[Long],
    minPrice: Option[Long],
    maxPrice: Option[Long])

case class Source3(
    modelCode: String,
    transmissionType: String,
    transmissionDetailedType: String,
    gearsCount: Int,
    engineCapacity: Float,
    enginePowerW: Short,
    fuel: String,
    mileage: Option[Long],
    minPrice: Option[Long],
    maxPrice: Option[Long])

case class Source4(
    manufacturer: String,
    productionCountry: String,
    brandName: String,
    modelCode: String,
    modelName: String,
    subBrand: String,
    bodyType: String,
    seatsCount: Int,
    doorsCount: Short,
    canInstallHitch: Boolean,
    hasHitch: Boolean,
    mileage: Option[Long],
    minPrice: Option[Long],
    maxPrice: Option[Long])
