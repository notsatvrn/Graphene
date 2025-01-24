[Purpur]: https://purpur.pl3x.net

## Tentacles

Light and flexible Minecraft 1.17.1 server software based on [Purpur].

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
