## Graphene

Light and flexible Minecraft 1.17.1 server software based on [Purpur](https://purpur.pl3x.net).

## Downloads

[![Downloads](https://img.shields.io/github/workflow/status/GrapheneMC-dev/Graphene/Build?event=push&label=Downloads&logo=github)](https://github.com/GrapheneMC-dev/Graphene/actions)

Downloads can be obtained from the [Github Actions page](https://github.com/GrapheneMC-dev/Graphene/actions).

## License

[![MIT License](https://img.shields.io/github/license/GrapheneMC-dev/Graphene?&logo=github)](LICENSE)

All patches are licensed under the MIT license, unless otherwise noted in the patch headers.

## Building and setting up

#### Initial setup

First, clone [paperweight](https://github.com/GrapheneMC-dev/paperweight) and run `./gradlew publishToMavenLocal` in its root directory.

Then, clone this repo and run `./gradlew applyPatches` in its root directory.

#### Creating a patch

Patches are effectively just commits in either `Graphene-API` or `Graphene-Server`.
To create one, just add a commit to either repo and run `./gradlew rebuildPatches`, and a
patch will be placed in the patches folder. Modifying commits will also modify its
corresponding patch file.

#### Compiling

Use the command `./gradlew build` to build the API and server. Compiled JARs
will be placed under `Graphene-API/build/libs` and `Graphene-Server/build/libs`.

To get a paperclip jar, run `./gradlew paperclip`.
To install the `graphene-api` and `graphene` dependencies to your local Maven repo, run `./gradlew publishToMavenLocal`
