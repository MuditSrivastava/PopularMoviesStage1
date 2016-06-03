# Popular Movies Stage 1
Android App to show Most Popular and Top Rated Movies.

Also displays Movies while using offline.

Created as a part of Udacity Android Developer Nanodegree 

## API used
The Movie Data Base (TMDb)

__NOTE:__ Add your API key to ``` MainAcitivty ```as specified below in order to run the app.
```
@Override
                    public void intercept(RequestFacade request) {
                        request.addEncodedQueryParam("api_key", "write_your_key_here");
                    }
```

You can obtain a key from [themoviedb.org](https://www.themoviedb.org)
## Libraries Used
[Picasso](http://square.github.io/picasso/)

[Retrofit](http://square.github.io/retrofit/)





