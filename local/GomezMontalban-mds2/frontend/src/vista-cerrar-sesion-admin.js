import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-cerrar-sesion-admin`
 *
 * VistaCerrarSesionAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCerrarSesionAdmin extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-cerrar-sesion-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCerrarSesionAdmin.is, VistaCerrarSesionAdmin);
