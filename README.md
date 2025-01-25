<div align="center">

## Graphene

[![MIT License](https://img.shields.io/github/license/GrapheneMC-dev/Graphene?&logo=github)](License)
[![Github Actions Build](https://img.shields.io/github/actions/workflow/status/GrapheneMC-dev/Graphene/build.yml?branch=ver/1.17.1&event=push&logo=github)](https://github.com/GrapheneMC-dev/Graphene/actions)

Light and flexible Minecraft 1.17.1 server software based on [Purpur](https://purpurmc.org/).

</div>

## ⚠️ Here be dragons! ⚠️

Graphene is **_pre-production_** software. Bugs, performance issues, and crashes **_can and will_** occur. In using this software, you assume all responsibility for any damage that occurs. If you encounter an issue, please check [here](https://github.com/GrapheneMC-dev/Graphene/issues) to see if we're already tracking it, and if not, file a report yourself. We'll get on it as soon as we can.

#### TL;DR: Graphene is not ready for use on servers you care about. _It will break._

## Credits

Graphene adds patches to Purpur from...

### Paper Forks

- [Sugarcane](https://github.com/SugarcaneMC/Sugarcane)
- [Yatopia](https://github.com/YatopiaMC/Yatopia)
- [Origami](https://github.com/Minebench/Origami)
- [Parchment](https://github.com/ProjectEdenGG/Parchment)
- [Mirai](https://github.com/etil2jz/Mirai)
- [Patina](https://github.com/PatinaMC/Patina)
- [JettPack](https://gitlab.com/Titaniumtown/JettPack/-/tree/main)
- [Akarin](https://github.com/Akarin-project/Akarin)
- [Pufferfish](https://github.com/pufferfish-gg/Pufferfish)
- [Sakura](https://github.com/etil2jz/Sakura)
- [Crunchy (repo taken down)](https://github.com/MrFishCakes/Crunchy)
- [Utopia](https://github.com/bortexel/utopia)
- [Slice](https://github.com/Cryptite/Slice)
- [KTP](https://github.com/lynxplay/ktp)
- [Nyper (repo taken down)](https://github.com/NyCodeGHG/Nyper)
- [Nabulus](https://github.com/FroobWorld/Nabulus)
- [P4per (patches edited and squashed)](https://github.com/acrylic-style/P4per)
- [Leaf (repo taken down, patches edited and squashed)](https://github.com/anhcraft/Leaf)

### Mods

- [Lithium](https://github.com/CaffeineMC/lithium-fabric)
- [VMP](https://github.com/RelativityMC/VMP-fabric)

## Downloads

Downloads can be obtained from the [Github Actions page](https://github.com/GrapheneMC-dev/Graphene/actions).

## License

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
