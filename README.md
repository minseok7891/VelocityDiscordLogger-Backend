<div align="center">

# Velocity Discord Logger - Backend

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Minecraft](https://img.shields.io/badge/Minecraft-1.21.10-green?style=for-the-badge&logo=minecraft)
![Velocity](https://img.shields.io/badge/Platform-Velocity-0066CC?style=for-the-badge&logo=velocity&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

[한국어](README.md) | [English](README_EN.md)

</div>

---

**VelocityDiscordLogger-Backend**는 [VelocityDiscordLogger](https://github.com/minseok7891/VelocityDiscordLogger)와 함께 작동하는 **Spigot/Paper/Purpur 서버용 경량 백엔드 플러그인**입니다.

이 플러그인은 단독으로 작동하지 않으며, 반드시 Velocity 프록시에 메인 플러그인이 설치되어 있어야 합니다.

## ✨ 주요 기능

### 📡 데이터 전달 (Bridge)
백엔드 서버에서 발생하는 이벤트를 감지하여 **Plugin Messaging Channel**을 통해 Velocity 프록시로 전달합니다.

- **🏆 도전과제 감지**: 플레이어가 발전 과제를 달성하면 제목과 설명을 프록시로 보냅니다.
- **☠️ 사망 감지**: 플레이어의 사망 메시지를 감지하여 프록시로 보냅니다.

---

## 📥 설치 방법

1. [Releases](https://github.com/minseok7891/VelocityDiscordLogger-Backend/releases) 탭에서 최신 버전을 다운로드하세요.
2. `VelocityDiscordLogger-Backend.jar` 파일을 백엔드 서버(Lobby, Survival, Creative 등)의 `plugins` 폴더에 넣습니다.
3. 서버를 재시작합니다.

**⚠️ 주의사항**: Velocity 프록시 서버에 반드시 `VelocityDiscordLogger`가 설치되어 있어야 작동합니다.

---

## ⚙️ 설정

**설정이 필요 없습니다!** 🎉  
이 플러그인은 단순히 데이터를 전달하는 역할만 수행합니다.  
모든 디스코드 채널 설정, 메시지 포맷팅, ON/OFF 설정은 Velocity 프록시의 `config.toml`에서 중앙 관리합니다.

---

<div align="center">
  Made with ❤️ by minseok
</div>
