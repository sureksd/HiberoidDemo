# Hiberoid Android to Sqlite

*Hiberoid provide relationship between Object and Database of Sqlite.
Hiberoid is work same as like hibernate but Hiberoid is work on only android. It's simple to use in android.*

<!--![Thumbnail of slate](thumbnail.png)-->

## Usage

To use the Hiberoid:

1. Android Studio: Add the following to your modul level build.gradle file:

    ```yml
    compile 'com.om.hiberoid:hiberoid:1.0.0'
    ```

2. For Maven project using in pom.xml:

    ```ruby
    <dependency>
        <groupId>com.om.hiberoid</groupId>
        <artifactId>hiberoid</artifactId>
        <version>1.0.0</version>
        <type>pom</type>
    </dependency>
    ```



## Customizing

### Configuration variables

Slate will respect the following variables, if set in your site's `_config.yml`:

```yml
title: [The title of your site]
description: [A short description of your site's purpose]
```

Additionally, you may choose to set the following optional variables:

```yml
show_downloads: ["true" or "false" to indicate whether to provide a download URL]
google_analytics: [Your Google Analytics tracking ID]
```

### Stylesheet

If you'd like to add your own custom styles:

1. Create a file called `/assets/css/style.css` in your site
2. Add the following content to the top of the file, exactly as shown:
    ```scss
    ---
    ---

    @import "{{ site.theme }}";
    ```
3. Add any custom CSS (or Sass, including imports) you'd like immediately after the `@import` line

### Layouts

If you'd like to change the theme's HTML layout:

1. [Copy the original template](https://github.com/pages-themes/slate/blob/master/_layouts/default.html) from the theme's repository<br />(*Pro-tip: click "raw" to make copying easier*)
2. Create a file called `/_layouts/default.html` in your site
3. Paste the default layout content copied in the first step
4. Customize the layout as you'd like

## Roadmap

See the [open issues](https://github.com/pagse-themes/slate/issues) for a list of proposed features (and known issues).

## Project philosophy

The Slate theme is intended to make it quick and easy for GitHub Pages users to create their first (or 100th) website. The theme should meet the vast majority of users' needs out of the box, erring on the side of simplicity rather than flexibility, and provide users the opportunity to opt-in to additional complexity if they have specific needs or wish to further customize their experience (such as adding custom CSS or modifying the default layout). It should also look great, but that goes without saying.

## Contributing

Interested in contributing to Slate? We'd love your help. Slate is an open source project, built one contribution at a time by users like you. See [the CONTRIBUTING file](CONTRIBUTING.md) for instructions on how to contribute.

### Previewing the theme locally

If you'd like to preview the theme locally (for example, in the process of proposing a change):

1. Clone down the theme's repository (`git clone https://github.com/pages-themes/slate`)
2. `cd` into the theme's directory
3. Run `script/bootstrap` to install the necessary dependencies
4. Run `bundle exec jekyll serve` to start the preview server
5. Visit [`localhost:4000`](http://localhost:4000) in your browser to preview the theme

### More Description 
[Visit Hiberoid github page](https://sureksd.github.io/HiberoidDemo/)
