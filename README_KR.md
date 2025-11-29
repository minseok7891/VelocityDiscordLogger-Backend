# VelocityDiscordLogger-Backend (한국어)

[VelocityDiscordLogger](https://github.com/minseok7891/VelocityDiscordLogger)와 함께 작동하는 Spigot/Paper/Purpur 서버용 경량 백엔드 플러그인입니다.

## 목적

이 플러그인은 백엔드 서버에서 발생하는 특정 이벤트를 감지하여 플러그인 메시징(Plugin Messaging)을 통해 Velocity 프록시로 전달합니다. 프록시에 설치된 메인 `VelocityDiscordLogger` 플러그인이 이 데이터를 받아 디스코드에 전송합니다.

## 주요 기능

- **도전과제 로깅**: 플레이어가 발전 과제를 달성하면 제목과 설명을 감지하여 프록시로 보냅니다.
- **사망 로깅**: 플레이어의 사망 메시지를 감지하여 프록시로 보냅니다.

## 설치 방법

1. 최신 릴리즈를 다운로드합니다.
2. `VelocityDiscordLogger-Backend.jar` 파일을 백엔드 서버(Lobby, Survival, Creative 등)의 `plugins` 폴더에 넣습니다.
3. **필수 조건**: Velocity 프록시 서버에 `VelocityDiscordLogger`가 설치되어 있어야 합니다.

## 설정

별도의 설정이 필요 없습니다! 이 플러그인은 단순히 데이터를 전달하는 역할만 수행합니다. 모든 디스코드 채널 설정과 메시지 포맷팅은 Velocity 프록시의 메인 플러그인에서 관리합니다.
