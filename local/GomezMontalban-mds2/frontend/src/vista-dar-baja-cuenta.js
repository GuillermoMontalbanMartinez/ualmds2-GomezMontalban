import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaDarBajaCuenta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;background: radial-gradient(circle, rgba(174,238,236,1) 63%, rgba(239,248,249,1) 100%);" id="vaadinVerticalLayoutDarDeBajaCuentaDeUsuario">
 <h1 style="align-self: center; margin-bottom: var(--lumo-space-m); margin: var(--lumo-space-xl);">Dar de baja cuenta de usuario</h1>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; align-self: center; flex-shrink: 0; justify-content: center; margin-bottom: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <label style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);font-weight: bold;">Correo</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
    <vaadin-text-field style="flex-shrink: 0;align-self: center; margin: var(--lumo-space-m);" id="text-correo"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center; margin-bottom: var(--lumo-space-m);">
   <label style="flex-shrink: 0; align-self: center; margin-right: var(--lumo-space-l);font-weight: bold;">Tipo de ususario</label>
   <vaadin-horizontal-layout theme="spacing" id="layout-select" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xs);"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary error" id="buttonCancelar">
      Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button theme="primary" id="buttonAceptar">
      Aceptar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-dar-baja-cuenta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarBajaCuenta.is, VistaDarBajaCuenta);
