import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-buscar-producto.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaBannerRegistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 6%;">
  <img style="width: 100%; height: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 100%;">
  <vista-buscar-producto style="height: 100%; width: 100%;"></vista-buscar-producto>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; justify-content: center; width: 10%;">
  <iron-icon style="align-self: center;"></iron-icon>
  <vaadin-button theme="primary" style="align-self: center;">
    Correo 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; justify-content: center; margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 10%;">
  <iron-icon style="align-self: center;"></iron-icon>
  <vaadin-button theme="primary" style="align-self: center;">
    Mi perfil 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 10%;">
  <iron-icon style="align-self: center; width: 60%; height: 70%;"></iron-icon>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-banner-registrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerRegistrado.is, VistaBannerRegistrado);
