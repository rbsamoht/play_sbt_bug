#!/usr/bin/env bash
set -o errexit
set -o nounset
set -o pipefail
set -o xtrace

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

cd "${DIR}"
sbt ";clean;reload;project1/run;project2/run"
