<H1>The Slate theme</H1>

Build Status Gem Version

Slate is a Jekyll theme for GitHub Pages. You can preview the theme to see what it looks like, or even use it today.

Thumbnail of slate

Usage

To use the Slate theme:

Add the following to your site's _config.yml:

theme: jekyll-theme-slate
Optionally, if you'd like to preview your site on your computer, add the following to your site's Gemfile:

gem "github-pages", group: :jekyll_plugins
Customizing

Configuration variables

Slate will respect the following variables, if set in your site's _config.yml:

title: [The title of your site]
description: [A short description of your site's purpose]
Additionally, you may choose to set the following optional variables:

show_downloads: ["true" or "false" to indicate whether to provide a download URL]
google_analytics: [Your Google Analytics tracking ID]
Stylesheet

If you'd like to add your own custom styles:

Create a file called /assets/css/style.css in your site
Add the following content to the top of the file, exactly as shown:

---
---

@import "{{ site.theme }}";
Add any custom CSS (or Sass, including imports) you'd like immediately after the @import line
Layouts

If you'd like to change the theme's HTML layout:

Copy the original template from the theme's repository
(Pro-tip: click "raw" to make copying easier)
Create a file called /_layouts/default.html in your site
Paste the default layout content copied in the first step
Customize the layout as you'd like
Roadmap

See the open issues for a list of proposed features (and known issues).

Project philosophy

The Slate theme is intended to make it quick and easy for GitHub Pages users to create their first (or 100th) website. The theme should meet the vast majority of users' needs out of the box, erring on the side of simplicity rather than flexibility, and provide users the opportunity to opt-in to additional complexity if they have specific needs or wish to further customize their experience (such as adding custom CSS or modifying the default layout). It should also look great, but that goes without saying.

Contributing

Interested in contributing to Slate? We'd love your help. Slate is an open source project, built one contribution at a time by users like you. See the CONTRIBUTING file for instructions on how to contribute.

Previewing the theme locally

If you'd like to preview the theme locally (for example, in the process of proposing a change):

Clone down the theme's repository (git clone https://github.com/pages-themes/slate)
cd into the theme's directory
Run script/bootstrap to install the necessary dependencies
Run bundle exec jekyll serve to start the preview server
Visit localhost:4000 in your browser to preview the theme
Running tests

The theme contains a minimal test suite, to ensure a site with the theme would build successfully. To run the tests, simply run script/cibuild. You'll need to run script/bootstrap one before the test script will work.
