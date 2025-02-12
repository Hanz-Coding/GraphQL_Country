package hanz.coding.graphql.domain

class GetCountriesUseCase(
    private val countryClient: CountryClient,
) {
    suspend fun execute(): List<CountryUI> {
        return countryClient.getCountries()
            .sortedBy { it.name }
    }
}