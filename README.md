# EZTV API

This library provides a java wrapper around the eztv-api. You have to provide the api url yourself though.

## Installation

Just add it as dependency to your project. It's available via [jCenter](https://bintray.com/bintray/jcenter).

### Maven

```
<dependency>
    <groupId>com.priitlaht</groupId>
    <artifactId>eztv-api</artifactId>
    <version>1.0</version>
</dependency>
```
Read the [set me up](https://bintray.com/bintray/jcenter) section first, if you haven't added jCenter as a repository to your pom.xml yet.

### Gradle

```
repositories {
    jcenter()
}

dependencies{
    compile group: 'com.priitlaht', name: 'eztv-api', version:'1.0'
}
```

## Usage

```java
/**
 * Get list of tv shows by page.
 *
 * @param apiUrl
 * @param page
 */
List<TvShow> result = EztvApi.getTvShows("your_api_url", 1);
```

```java
/**
 * Get show details by imdb id.
 *
 * @param apiUrl
 * @param imdbId
 */
TvShowDetails result = EztvApi.getShowDetails("your_api_url", "tt0944947");
```

## License

[Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0)
