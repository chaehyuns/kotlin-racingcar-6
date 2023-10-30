package racingcar.domain.car

import racingcar.Constants


data class CarNames(private val names: List<String>) {
    init {
        require(this.names.all { it.length <= 5 }) { Constants.LENGTH_ERROR_MESSAGE }
    }
}
