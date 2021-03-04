import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCerrarSesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center; justify-content: center;">
 <h1 style="margin-bottom: var(--lumo-space-xl);">Cerrar sesion</h1>
 <vaadin-button theme="primary" style="width: 15%; margin-bottom: var(--lumo-space-m);">
  Cerrar sesion
 </vaadin-button>
 <vaadin-button theme="primary error" style="margin-bottom: var(--lumo-space-m);">
  Cancelar
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cerrar-sesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCerrarSesion.is, VistaCerrarSesion);
