## Tailwindcss Readme
## Step 1 : Run `npm init -y` in project terminal

package.json file will be created

```json
{
  "name": "scm2.0",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "repository": {
    "type": "git",
    "url": "git+https://github.com/Rajeev-singh-git/Smart-Contact-Manager.git"
  },
  "keywords": [],
  "author": "",
  "license": "ISC",
  "bugs": {
    "url": "https://github.com/Rajeev-singh-git/Smart-Contact-Manager/issues"
  },
  "homepage": "https://github.com/Rajeev-singh-git/Smart-Contact-Manager#readme"
}
```

### **1.1)  Add type as module**

`“type” : “module”`

```json
{
  "name": "scm2.0",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "type":"module",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "repository": {
    "type": "git",
    "url": "git+https://github.com/Rajeev-singh-git/Smart-Contact-Manager.git"
  },
  "keywords": [],
  "author": "",
  "license": "ISC",
  "bugs": {
    "url": "https://github.com/Rajeev-singh-git/Smart-Contact-Manager/issues"
  },
  "homepage": "https://github.com/Rajeev-singh-git/Smart-Contact-Manager#readme"
}
```

## Step 2 → Install npm tailwind

In terminal run `npm install -D tailwindcss`

## Step 3 → Initialize tailwind

In terminal run `npx tailwindcss init`

$tailwind.config.js$  file will get added

```jsx
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [],
  theme: {
    extend: {},
  },
  plugins: [],
}
```

Edit location in content.

`content: ["./src/main/resources/**/*.{html,js}"],`

Basically, it means any file ending with `.html` and `.js` at that location is the content of tailwind

```jsx
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/main/resources/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [],
}

```

## Step 4 :  Create a input.css file

Location : src/main/resources/static/css

Create a input.css file and configure

```css
/* src/main/resources/static/css */

@tailwind base;
@tailwind components;
@tailwind utilities;

```

Our input file is ***input.css.***

The output will be created by tailwind in ***output.css.***

## To Run TailwindCss

Run command each time you start the project

`npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch`

```css
npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch
```

## How to add flowbite

We are using flow bite for the ready made library.

Include css and javascript using cdn

In html head of  home.html, add

```css
<link href="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.css" rel="stylesheet" />
```

Add “js”  just before where Body ends add

```css
<script src="https://cdn.jsdelivr.net/npm/flowbite@2.4.1/dist/flowbite.min.js"></script>
```

## Add tailwind to any page

### Step T.1 →  Run Command

```css
npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch
```

### Steps T.2) Include output.css in your html page

Ex :

```html
<link rel="stylesheet" data-th-href="@{'/css/output.css'}" />
```